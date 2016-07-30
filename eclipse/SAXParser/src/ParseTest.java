import java.io.InputStream;

import junit.framework.TestCase;

import com.wjliuh.entity.ShoppingCart;
import com.wjliuh.parser.GoodParser;

public class ParseTest extends TestCase{

	public void testSAX() throws Throwable{
		GoodParser sax = new GoodParser();
		long s = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			InputStream input = this.getClass().getClassLoader().getResourceAsStream("goods.xml");
			ShoppingCart sc = new ShoppingCart(sax.getGoods(input));
			sc.list();
			System.out.println(sc.getTotalCost());
		}
		System.out.println(System.currentTimeMillis() - s);

	}
}