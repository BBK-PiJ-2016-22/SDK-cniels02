//package exercise1

import scala.util.Random


object Hammurabi {

  def hammurabi(): Unit = {
    val starved = "0"
    var immigrants = 5
    var population = 100
    var harvest = 3000
    var bushelsPerAcre = 3
    var rat_ate = 200
    var bushelsInStorage = 2800
    var acresOwned = 1000
    var pricePerAcre = 19
    var plagueDeaths = 0

    printIntroductoryMessage()

    var year = 0
    for (year <- 1 to 10) {


      // inputs from user

      val acresToBuy = askHowMuchLandToBuy(bushelsInStorage,pricePerAcre)
      acresOwned = acresOwned + acresToBuy
      bushelsInStorage = bushelsInStorage - (acresToBuy*pricePerAcre)

      if(acresToBuy == 0) {
        val acresToSell = askHowMuchLandToSell(acresOwned)
        acresOwned = acresOwned - acresToSell
        bushelsInStorage = pricePerAcre * acresToSell
      }

      val grainsToFeed = askHowMuchGrainToFeedThePeople(bushelsInStorage)
      bushelsInStorage = bushelsInStorage - grainsToFeed

      val acresToPlant = askHowManyAcresToPlant(bushelsInStorage, acresOwned, bushelsPerAcre)
      bushelsInStorage = bushelsInStorage - (acresToPlant * bushelsPerAcre)

      // year calculation

      // plague
      if(plague()){
        population = population / 2
      }

      // people starve



      println(
        s"""
                   O great Hammurabi!
                   You are $year in year  of your ten year rule.
                   In the previous year $starved people starved to death.
                   In the previous year $immigrants people entered the kingdom.
                   The population is now $population.
                   We harvested $harvest bushels at $bushelsPerAcre bushels per acre.
                   Rats destroyed $rat_ate bushels, leaving $bushelsInStorage bushels in storage.
                   The city owns $acresOwned acres of land.
                   Land is currently worth $pricePerAcre bushels per acre.
                   There were $plagueDeaths deaths from the plague.""")
    }
  }


  def readInt(message: String): Int = {
    try {
      readLine(message).toInt
    } catch {
      case _: Throwable =>
        println("That’s not an integer. Please enter an integer.")
        readInt(message)
    }
  }
  def printIntroductoryMessage() {
    println(
      """     Congratulations, you are the newest ruler of ancient Samaria, elected
                   for a ten year term of office. Your duties are to dispense food, direct
                   farming, anld buy and sell land as needed to support your people. Watch
                   out for rat infestations and the plague! Grain is the general currency,
                   measured in bushels. The following will help you in your decisions:
                     * Each person needs at least 20 bushels of grain per year to survive.
                     * Each person can farm at most 10 acres of land.
                     * It takes 2 bushels of grain to farm an acre of land.
                     * The market price for land fluctuates yearly.
                   Rule wisely and you will be showered with appreciation at the end of
                   your term. Rule poorly and you will be kicked out of office!""")

  }

  def askHowMuchLandToBuy(bushels: Int, price: Int): Int = {
    println()
    var acresToBuy =  readInt("How many acres will you buy? ")

    while (acresToBuy < 0 || acresToBuy * price > bushels) {
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
      println()
      acresToBuy = readInt("How many acres will you buy? ")
    }
    acresToBuy
  }

  def askHowMuchLandToSell(acresOwned: Int): Int = {
    println()
    var acresToSell = readInt("How many acres will you sell? ")

    while(acresToSell < 0 || acresToSell > acresOwned){
      println("O Great Hammurabi, we have but " + acresOwned + " acres!")
      println()
      acresToSell = readInt("How many acres will you sell? ")

    }
    acresToSell

  }

  def askHowMuchGrainToFeedThePeople(bushels: Int): Int ={
    println()
    var grainsToFeed = readInt("How much grain do you want to feed the people? ")

    while(grainsToFeed < 0 || grainsToFeed > bushels){
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
      println()
      grainsToFeed = readInt("How much grain do you want to feed the people? ")

    }

    grainsToFeed
  }

  def askHowManyAcresToPlant(bushels: Int, acresOwned: Int, bushelsPerAcre: Int): Int ={
    println()
    var acresToPlant = readInt("How many acres to plant? ")

    while(acresToPlant < 0 || acresToPlant > acresOwned || bushels > bushels*bushelsPerAcre){

      if(bushels > bushels*bushelsPerAcre) {
        println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
        println()
        acresToPlant = readInt("How many acres to plant? ")
      }else{
        println("O Great Hammurabi, we have but " + acresOwned + " acres!")
        println()
        acresToPlant = readInt("How many acres to plant? ")
      }


    }

    acresToPlant

  }

  def plague(): Boolean ={

    var flag = false
    val p = 15

    if (Random.nextInt(100) < p) {
      flag = true
    }

    flag
  }


  Hammurabi.hammurabi()



}

