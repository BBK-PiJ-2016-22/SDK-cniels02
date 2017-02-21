package adapter

/**
  * Created by Casper on 21/02/2017.
  */
class XpayToPayDAdapter {

  implicit def adapt(xpay: XpayImpl) : PayD = new PayD {

    override def setCVVNo(cVVNo: Integer): Unit = xpay.setCardCVVNo(cVVNo.shortValue())

    override def setCardExpMonthDate(cardExpMonthDate: String): Unit = xpay.setCardExpMonth(cardExpMonthDate)

    override def getCardExpMonthDate: String = xpay.getCardExpMonth

    override def setCardOwnerName(cardOwnerName: String): Unit = xpay.setCustomerName(cardOwnerName)

    override def getTotalAmount: Double = xpay.getAmount

    override def getCustCardNo: String = xpay.getCreditCardNo

    override def setCustCardNo(custCardNo: String): Unit = xpay.setCreditCardNo(custCardNo)

    override def getCardOwnerName: String = xpay.getCustomerName

    override def getCVVNo:Int = xpay.getCardCVVNo.toInt

    override def setTotalAmount(totalAmount: Double): Unit = xpay.setAmount(totalAmount)
  }


}
