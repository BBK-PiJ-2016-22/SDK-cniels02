package adapter

/**
  * Created by Casper on 21/02/2017.
  */
trait Xpay {

    def getCreditCardNo: String
    def setCreditCardNo(creditCardNo: String)
    def getCustomerName: String
    def setCustomerName(customerName: String)
    def getCardExpMonth: String
    def setCardExpMonth(cardExpMonth: String)
    def getCardExpYear: String
    def setCardExpYear(cardExpYear: String)
    def getCardCVVNo: Short
    def setCardCVVNo(cardCVVNo: Short)
    def getAmount: Double
    def setAmount(amount: Double)
}
