package context;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class ScenarioContext
{
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    public void setLoginPage(LoginPage loginPage)
    {
        this.loginPage = loginPage;
    }
    public LoginPage getLoginPage()
    {
        return loginPage;
    }
    public void setProductsPage(ProductsPage productsPage)
    {
        this.productsPage = productsPage;
    }
    public ProductsPage getProductsPage()
    {
        return productsPage;
    }
    public void setCartPage(CartPage cartPage)
    {
        this.cartPage = cartPage;
    }

    public CartPage getCartPage()
    {
        return this.cartPage;
    }
    public void setCheckoutPage(CheckoutPage checkoutPage)
    {
        this.checkoutPage = checkoutPage;
    }
    public CheckoutPage getCheckoutPage()
    {
        return this.checkoutPage;
    }

}
