import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedBoxTest {
    @Test
    public void EncodeSampleTest () {
        String s = "отдай мою кроличью лапку";
        assertEquals("омоюу толл дюиа акчп йрьк",RedBox.TheRabbitsFoot(s,true));
    }

    @Test
    public void DecodeSampleTest () {
        String s = "омоюу толл дюиа акчп йрьк";
        assertEquals("отдаймоюкроличьюлапку",RedBox.TheRabbitsFoot(s,false));
    }

    @Test
    public void EncodeTest () {
        String s = "Пошли ужинать еда уже остывает";
        assertEquals("Пжеое оидст шнат лауы итжв уьеа",RedBox.TheRabbitsFoot(s,true));
    }

    @Test
    public void DecodeTest () {
        String s = "Пжеое оидст шнат лауы итжв уьеа";
        assertEquals("Пошлиужинатьедаужеостывает",RedBox.TheRabbitsFoot(s,false));
    }

    @Test
    public void EncodePogranTest () {
        String s = "Делу время а потехе час";
        assertEquals("Дрпе ееоч лмта уяес вах",RedBox.TheRabbitsFoot(s,true));
    }

    @Test
    public void DecodePogranTest () {
        String s = "Дрпе ееоч лмта уяес вах";
        assertEquals("Делувремяапотехечас",RedBox.TheRabbitsFoot(s,false));
    }

    @Test
    public void NumbersEncodeTest () {
        String s = "12345 78435 98123";
        assertEquals("13 25 39 48 51 72 83 4",RedBox.TheRabbitsFoot(s,true));
    }

    @Test
    public void NumbersDecodeTest () {
        String s = "13 25 39 48 51 72 83 4";
        assertEquals("123457843598123",RedBox.TheRabbitsFoot(s,false));
    }

    @Test
    public void EmptyTest () {
        String s = "";
        assertEquals("",RedBox.TheRabbitsFoot(s,false));
    }
}