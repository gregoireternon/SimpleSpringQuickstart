package exatoster;


import exatoster.service.IAgeComputer;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class SimpleRestAppTest {

    @Test
    public void MyTest(){
        IAgeComputer ageComputer = mock(IAgeComputer.class);
        ageComputer.compute(10);

        verify(ageComputer).compute(10);
        assert 1==1;
    }
}
