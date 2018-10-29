package fr.iut;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import fr.iut.Cart;
import fr.iut.Item;

public class TestElephanto{
	
	@Test
	public void creeitem() {
		final Item item1 = new Item("Four",500);
	}
	
	@Test
	public void creecart() {
		final Cart cart = new Cart();		
	}
	
	@Test 
	public void addItemCart() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 3);
	}
	
	@Test
	public void calculPanierHT() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 3);
		double expectedvalue = 1500d;
		double actualValue = cart.calculCartHT();
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void caculPanierHtavecreducinfmille() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 1);
		double expectedvalue = 500;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void caculPanierHtavecreducinfcinqmille() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 3);
		double expectedvalue = 1500 - 1500*0.03;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void caculPanierHtavecreducinfseptmille() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 11);
		double expectedvalue = 5500 - 5500*0.05;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void caculPanierHtavecreducinfdixmille() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 15);
		double expectedvalue = 7500 - 7500*0.07;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void caculPanierHtavecreducinfcinquantemille() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 21);
		double expectedvalue = 10500 - 10500*0.10;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void caculPanierHtavecreducsupcinquantemille() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void calculPanierTTCDE() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		expectedvalue = expectedvalue + expectedvalue * 0.19;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		actualValue = cart.calculcartTTC("DE", actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void calculPanierTTCDK() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		expectedvalue = expectedvalue + expectedvalue * 0.25;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		actualValue = cart.calculcartTTC("DK", actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void calculPanierTTCHR() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		expectedvalue = expectedvalue + expectedvalue * 0.25;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		actualValue = cart.calculcartTTC("HR", actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void calculPanierTTCIS() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		expectedvalue = expectedvalue + expectedvalue * 0.255;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		actualValue = cart.calculcartTTC("IS", actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void calculPanierTTCCH() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		expectedvalue = expectedvalue + expectedvalue * 0.08;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		actualValue = cart.calculcartTTC("CH", actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	@Test
	public void calculPanierTTCFR() {
		final Cart cart = new Cart();
		final Item item1 = new Item("Four",500);
		cart.addItemtoCart(item1, 101);
		double expectedvalue = 50500 - 50500*0.15;
		expectedvalue = expectedvalue + expectedvalue * 0.196;
		double actualValue = cart.calculCartHT();
		actualValue = cart.calculcartHTreduc(actualValue);
		actualValue = cart.calculcartTTC("FR", actualValue);
		assertEquals(expectedvalue,actualValue,0.01d);
	}
	
	
	
		
		

	
	
}