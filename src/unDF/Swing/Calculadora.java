package unDF.Swing;

		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
import java.util.Stack;

		public class Calculadora extends JFrame implements ActionListener {
		    private JTextField display;

		    public Calculadora() {
		        setTitle("Calculadora");
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setSize(400, 400);

		        JPanel panel = new JPanel(new BorderLayout());
		        display = new JTextField();
		        display.setEditable(false);
		        panel.add(display, BorderLayout.NORTH);

		        JPanel buttonsPanel = new JPanel(new GridLayout(4, 4));
		        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
		        for (String label : buttonLabels) {
		            JButton button = new JButton(label);
		            button.addActionListener(this);
		            buttonsPanel.add(button);
		        }
		        panel.add(buttonsPanel, BorderLayout.CENTER);

		        add(panel);
		        setVisible(true);
		    }

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String command = e.getActionCommand();
		        if (command.equals("=")) {
		            calcular();
		        } else if (command.equals("C")) {
		            display.setText("");
		        } else {
		            display.setText(display.getText() + command);
		        }
		    }

		    private void calcular() {
		        String expression = display.getText();
		        try {
		            double result = evaluate(expression);
		            display.setText(Double.toString(result));
		        } catch (ArithmeticException | NumberFormatException ex) {
		            display.setText("Erro");
		        }
		    }

		    private double evaluate(String expression) {
		        // Remove espaços em branco
		        expression = expression.replaceAll("\\s+", "");

		        // Verifica se a expressão está vazia
		        if (expression.isEmpty()) {
		            throw new IllegalArgumentException("Expressão vazia");
		        }

		        // Divide a expressão em tokens usando uma expressão regular mais robusta
		        String[] tokens = expression.split("(?=[-+*/()])|(?<=[-+*/()])");

		        // Cria uma pilha para armazenar os valores e os operadores
		        Stack<Double> stack = new Stack<>();
		        Stack<Character> operators = new Stack<>();

		        // Itera sobre os tokens
		        for (String token : tokens) {
		            if (!token.isEmpty()) {
		                if (isNumber(token)) {
		                    // Se for um número, converte para double e empilha
		                    stack.push(Double.parseDouble(token));
		                } else {
		                    // Se for um operador
		                    char operator = token.charAt(0);
		                    if (operator == '(') {
		                        // Empilha o operador de abertura de parênteses
		                        operators.push(operator);
		                    } else if (operator == ')') {
		                        // Desempilha os operadores e executa as operações até encontrar o operador de abertura de parênteses
		                        while (!operators.isEmpty() && operators.peek() != '(') {
		                            executeOperation(stack, operators.pop());
		                        }
		                        // Remove o operador de abertura de parênteses
		                        operators.pop();
		                    } else {
		                        // Desempilha os operadores de maior precedência e executa as operações
		                        while (!operators.isEmpty() && precedence(operator) <= precedence(operators.peek())) {
		                            executeOperation(stack, operators.pop());
		                        }
		                        // Empilha o operador atual
		                        operators.push(operator);
		                    }
		                }
		            }
		        }

		        // Desempilha os operadores restantes e executa as operações
		        while (!operators.isEmpty()) {
		            executeOperation(stack, operators.pop());
		        }

		        // Verifica se a pilha possui exatamente um valor, que é o resultado final
		        if (stack.size() != 1) {
		            throw new IllegalArgumentException("Expressão inválida");
		        }

		        // Retorna o resultado final
		        return stack.pop();
		    }

		    private void executeOperation(Stack<Double> stack, char operator) {
		        double operand2 = stack.pop();
		        double operand1 = stack.pop();
		        double result = 0;
		        switch (operator) {
		            case '+':
		                result = operand1 + operand2;
		                break;
		            case '-':
		                result = operand1 - operand2;
		                break;
		            case '*':
		                result = operand1 * operand2;
		                break;
		            case '/':
		                if (operand2 == 0) {
		                    throw new ArithmeticException("Divisão por zero");
		                }
		                result = operand1 / operand2;
		                break;
		            default:
		                throw new IllegalArgumentException("Operador inválido: " + operator);
		        }
		        // Empilha o resultado da operação
		        stack.push(result);
		    }

		    private int precedence(char operator) {
		        switch (operator) {
		            case '+':
		            case '-':
		                return 1;
		            case '*':
		            case '/':
		                return 2;
		            default:
		                return 0;
		        }
		    }

		    private boolean isNumber(String str) {
		        try {
		            Double.parseDouble(str);
		            return true;
		        } catch (NumberFormatException e) {
		            return false;
		        }
		    }


		    public static void main(String[] args) {
		        new Calculadora();
		    }
		}



