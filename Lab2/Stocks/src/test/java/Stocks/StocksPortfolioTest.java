package Stocks;

import org.junit.jupiter.api.extension.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StocksPortfolioTest {
    @Mock 
    IStockMarket market;
    @InjectMocks 
    StocksPortfolio portfolio;

    @Test
    void getTotalValueWithMock() {

        when(market.getPrice("EBAY")).thenReturn(1.5);
        when(market.getPrice("MSFT")).thenReturn(2.5);

        portfolio.addStock(new Stock("EBAY",2));
        portfolio.addStock(new Stock("MSFT",2));
        

        assertThat(portfolio.getTotalValue(),is(8.0));

        verify(market, times(2)).getPrice(anyString());
    }
}