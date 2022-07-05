import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getCommission_VK_pay() {
        val com = getCommission(10000*100, VKPAY)
        assertEquals(com, 0)
    }

    @Test
    fun getCommission_MASTERCARD() {
        val com = getCommission(95000*100, MASTERCARD)
        assertEquals(com, 59000)
    }

    @Test
    fun getCommission_MIR() {
        val com = getCommission(100*100, MIR)
        assertEquals(com, 3500)
    }
}