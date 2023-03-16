package test.java.exercises;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = main.java.exercises.QueueUsingTwoStacks.class)
class QueueUsingTwoStacksTests{

    private QueueUsingTwoStacks queue;

    @Before
    public void setup(){
        this.queue = new QueueUsingTwoStacks();
        
    }

}