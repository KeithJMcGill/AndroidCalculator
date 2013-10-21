package com.keithjmcgill.calculator;
/**
 * This is the method class for InfixToPostfix.
 * @author Keith McGill
 * @version 12/8/12
 */

public class Stack 
{
	public int manyItems = 0;
	public int manyItemsS = 0;
	public double[] data;
	public String[] dataS;
	
	/**
	 * This is the constructor for the class and builds a stack for strings and a stack for doubles.
	 * @param initialCapacity
	 */
	public Stack(int initialCapacity)
	{
	      manyItems = 0;
	      manyItemsS = 0;
	      data = new double[initialCapacity];
	      dataS = new String[initialCapacity];
	}
	
	/**
	 * This looks at the top item in the double stack.
	 * @return
	 */
	public double peek()   
	   {
	      return data[manyItems-1];
	   }
	
	/**
	 * This takes off the top item in the double stack.
	 * @return
	 */
	public double pop()
	   {
	      return data[--manyItems];
	   }
	
	/**
	 * This puts an item onto the double stack.
	 * @param item
	 */
	public void push(double item)
	   {
	      data[manyItems] = item;
	      manyItems++;
	   }
	
	/**
	 * This looks at the top item in a string stack.
	 * @return
	 */
	public String peekS()   
	   {
	      return dataS[manyItemsS-1];
	   }
	
	/**
	 * This takes off the top item in the string stack.
	 * @return
	 */
	public String popS()
	   {
	      return dataS[--manyItemsS];
	   }
	
	/**
	 * This puts an item onto the string stack.
	 * @param item
	 */
	public void pushS(String item)
	   {
	      dataS[manyItemsS] = item;
	      manyItemsS++;
	   }
	
	/**
	 * This gets the solution to the postfix expression.
	 * @param postfix
	 * @return
	 */
	public double getResult(String postfix)
	{
		char character;
		String currentNum = "";
		double firstPop = 0, secondPop = 0, answer = 0, result = 0;
		
		for (int i = 0; i < postfix.length(); i++)
		{
			character = postfix.charAt(i);
			switch (character)
			{
			case ' ':
			{
				currentNum = "";
				break;
			}
			case '+':
			{
				firstPop = pop();
				secondPop = pop();
				answer = secondPop + firstPop;
				push(answer);
				break;
			}
			case '-':
			{
				firstPop = pop();
				secondPop = pop();
				answer = secondPop - firstPop;
				push(answer);
				break;
			}
			case '/':
			{
				firstPop = pop();
				secondPop = pop();
				answer = secondPop / firstPop;
				push(answer);
				break;
			}
			case '*':
			{
				firstPop = pop();
				secondPop = pop();
				answer = secondPop * firstPop;
				push(answer);
				break;
			}
			case '.':
			{
				currentNum += ".";
				break;
			}
			case '1':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "1";
				}
				else
				{
					currentNum += 1;
					push(getNumber(currentNum));
				}
				break;
			}
			case '2':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "2";
				}
				else
				{
					currentNum += 2;
					push(getNumber(currentNum));
				}
				break;
			}
			case '3':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "3";
				}
				else
				{
					currentNum += 3;
					push(getNumber(currentNum));
				}
				break;
			}
			case '4':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "4";
				}
				else
				{
					currentNum += 4;
					push(getNumber(currentNum));
				}
				break;
			}
			case '5':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "5";
				}
				else
				{
					currentNum += 5;
					push(getNumber(currentNum));
				}
				break;
			}
			case '6':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "6";
				}
				else
				{
					currentNum += 6;
					push(getNumber(currentNum));
				}
				break;
			}
			case '7':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "7";
				}
				else
				{
					currentNum += 7;
					push(getNumber(currentNum));
				}
				break;
			}
			case '8':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "8";
				}
				else
				{
					currentNum += 8;
					push(getNumber(currentNum));
				}
				break;
			}
			case '9':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "9";
				}
				else
				{
					currentNum += 9;
					push(getNumber(currentNum));
				}
				break;
			}
			case '0':
			{
				if (postfix.charAt(i+1) != ' ')
				{
					currentNum += "0";
				}
				else
				{
					currentNum += 0;
					push(getNumber(currentNum));
				}
				break;
			}
			}
		}
		result = pop();
		return result;
	}
	
	/**
	 * This is used by getResult to get the current number being calculated.
	 * @param currentNum
	 * @return
	 */
	public double getNumber(String currentNum)
	{
		char charValue;
		int numDot = 0, numDotCount = 0;
		double number = 0, numTotal = 0, numDec = 0, countDec = 10;
		
		for (int i = 0; i < currentNum.length(); i++)
		{
			charValue = currentNum.charAt(i);
			switch (charValue)
			{
			case '0':
				number = 0;
				break;
			case '1':
				number = 1;
				break;
			case '2':
				number = 2;
				break;
			case '3':
				number = 3;
				break;
			case '4':
				number = 4;
				break;
			case '5':
				number = 5;
				break;
			case '6':
				number = 6;
				break;
			case '7':
				number = 7;
				break;
			case '8':
				number = 8;
				break;
			case '9':
				number = 9;
				break;
			case '.':
				numDot = 1;
				break;
			}
			if (numDot != 1 && i == 0)
			{
				numTotal = number;
			}
			else if (numDot != 1)
			{
				numTotal = (numTotal * 10) + number;
			}
			else if (numDot == 1 && numDotCount == 1)
			{
				numDec = number / countDec;
				numTotal += numDec;
				countDec *= 10;
			}
			if (numDot == 1 && numDotCount == 0)
			{
				numDotCount++;
			}
		}
		return(numTotal);
	}
	
	/**
	 * This gets the postfix to the infix expression.
	 * @param infix
	 * @return
	 */
	public String getPostfix(String infix)
	{
		int checkAnswer = 0;
		char character, characterAt;
		String postfix = "", answer = "", discard = "", peakTop = "";

		for (int i = 0; i < infix.length(); i++)
		{
			character = infix.charAt(i);
			switch (character)
			{
				case '(':
				{
					answer = "(";
					pushS(answer);
					break;
				}
				case ')':
				{
					peakTop = peekS();
					if (peakTop == "+" || peakTop == "-" || peakTop == "*" || peakTop == "/")
					{
						answer = popS();
						postfix += " " + answer + " ";
					}
					else
					{
						checkAnswer = 1;
						break;
					}
					peakTop = peekS();
					if (peakTop == "(")
					{
						discard = popS();
						break;
					}
					else
					{
						checkAnswer = 1;
						break;
					}
				}
				case '+':
				{
					answer = "+";
					pushS(answer);
					if (infix.charAt(i+1) != '(')
					{
						postfix += " ";
					}
					break;
				}
				case '-':
				{
					answer = "-";
					pushS(answer);
					if (infix.charAt(i+1) != '(')
					{
						postfix += " ";
					}
					break;
				}
				case '/':
				{
					answer = "/";
					pushS(answer);
					if (infix.charAt(i+1) != '(')
					{
						postfix += " ";
					}
					break;
				}
				case '*':
				{
					answer = "*";
					pushS(answer);
					if (infix.charAt(i+1) != '(')
					{
						postfix += " ";
					}
					break;
				}
				case '.':
				{
					postfix += ".";
					break;
				}
				case '1':
				{
					postfix += "1";
					break;
				}
				case '2':
				{
					postfix += "2";
					break;
				}
				case '3':
				{
					postfix += "3";
					break;
				}
				case '4':
				{
					postfix += "4";
					break;
				}
				case '5':
				{
					postfix += "5";
					break;
				}
				case '6':
				{
					postfix += "6";
					break;
				}
				case '7':
				{
					postfix += "7";
					break;
				}
				case '8':
				{
					postfix += "8";
					break;
				}
				case '9':
				{
					postfix += "9";
					break;
				}
				case '0':
				{
					postfix += "0";
					break;
				}
			}
		}
		if (checkAnswer == 0)
		{
			return postfix;
		}
		else
		{
			System.out.println("You have entered an invalid infix expression.\n");
			return null;
		}
	}
}
