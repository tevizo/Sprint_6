import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensValue() throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodReturnsCorrectList() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
