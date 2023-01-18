package project11;

import java.util.*;

public class Print {
public static void commandPrint(Queue<Command> comQ) {
	while(comQ.peek()!=null) {
		comQ.poll().operation();
	}
}
public static void main(String[] args) {
	Build d=new Build();
	commandPrint(d.MakeQ());
}
}
