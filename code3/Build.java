package project11;
import java.util.*;

public class Build {
	Queue<Command> MakeQ(){
Queue<Command> com=new LinkedList<Command>();
for(int i=0;i<10;i++)
	com.offer(new Command(i+" "));
	return com;
}
}