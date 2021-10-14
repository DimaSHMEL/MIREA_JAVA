package ex_7;


import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Card_botva_play {
    private Scanner scanner = new Scanner(System.in);
    private Stack<Integer>
            first_player_S = new Stack<Integer>(),
            second_player_S = new Stack<Integer>(),
            bita_first_S = new Stack<Integer>(),
            bita_second_S = new Stack<Integer>();
    private ArrayDeque<Integer>
            first_player_D = new ArrayDeque<>(),
            second_player_D = new ArrayDeque<>();
    public void reverse_stack()
    {
        if(first_player_S.empty())
        {
            while(!bita_first_S.empty())
            {
                first_player_S.push(bita_first_S.peek());
                bita_first_S.pop();
            }
        }
        if(second_player_S.empty())
        {
            while(!bita_second_S.empty()) {
                second_player_S.push(bita_second_S.peek());
                bita_second_S.pop();
            }
        }
    }
    public Card_botva_play()
    {
        for(int i = 0; i < 5; i++)
        {
            int x;
            x = scanner.nextInt();
            bita_first_S.push(x);
            first_player_D.add(x);
        }
        for(int i = 0; i < 5; i++)
        {
            int x;
            x = scanner.nextInt();
            bita_second_S.push(x);
            second_player_D.add(x);
        }
        reverse_stack();
    }
    public void stack_botva()
    {
        for(int i = 0; i < 160; i++)
        {
            if(first_player_S.empty() && bita_first_S.empty())
            {
                System.out.println("second " + i);
                return;
            }
            else if(second_player_S.empty() && bita_second_S.empty())
            {
                System.out.println("first " + i);
                return;
            }
            else if(first_player_S.empty() || second_player_S.empty())
                reverse_stack();
            if(first_player_S.peek() > second_player_S.peek() && second_player_S.peek() != 0 || first_player_S.peek() == 0)
            {
                bita_first_S.add(second_player_S.peek());
                bita_first_S.add(first_player_S.peek());
                first_player_S.pop();
                second_player_S.pop();
            }
            else
            {
                bita_second_S.add(second_player_S.peek());
                bita_second_S.add(first_player_S.peek());
                first_player_S.pop();
                second_player_S.pop();
            }
        }
        System.out.println("Botva");
    }
    public void deque_botva()
    {
        for(int i = 0; i < 160; i++)
        {
            if(first_player_D.isEmpty())
            {
                System.out.println("second " + i);
                return;
            }
            else if(second_player_D.isEmpty())
            {
                System.out.println("first " + i);
                return;
            }
            if(first_player_D.peekFirst() > second_player_D.peekFirst() && second_player_D.peekFirst() != 0 || first_player_D.peekFirst() == 0)
            {
                first_player_D.addLast(first_player_D.poll());
                first_player_D.addLast(second_player_D.poll());
            }
            else
            {
                second_player_D.addLast(first_player_D.poll());
                second_player_D.addLast(second_player_D.poll());
            }
        }
        System.out.println("botva");
    }
}
