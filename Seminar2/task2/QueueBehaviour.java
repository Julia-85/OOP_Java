package Seminar2.task2;

import Seminar2.task1.Actor;


public interface QueueBehaviour {       

    void takeInQueue(Actor actor);  // очередь
    void takeOrders(Actor actor);
    void giveOrders(Actor actor);
    void releaseFromQueue(Actor actor);

}
