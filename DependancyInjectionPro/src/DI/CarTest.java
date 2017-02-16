package DI;

import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {
    @Test
    public void �ڵ���_�ڸ���Ÿ�̾�_����_Ÿ�̾�귣��_�׽�Ʈ() {
        Tire tire1 = new KoreaTire();
    	Car car1 = new Car(tire1);

        assertEquals("������ Ÿ�̾�: �ڸ��� Ÿ�̾�", car1.getTireBrand());
    }
    @Test
    public void �ڵ���_����Ÿ�̾�_����_Ÿ�̾�귣��_�׽�Ʈ(){
    	Tire tire2 = new AmericaTire();
    	Car car2 = new Car(tire2);
    	
    	assertEquals("������ Ÿ�̾�: ���� Ÿ�̾�", car2.getTireBrand());
    }
}