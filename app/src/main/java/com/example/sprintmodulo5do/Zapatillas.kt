package com.example.sprintmodulo5do

data class Zapatillas(val nombre:String,var imgUrl: String, val precio:Double )

class ZapatillaList{
    fun returnShoeList(): List<Zapatillas> {
        val shoeList = mutableListOf<Zapatillas>()
        val shoeItem1 = Zapatillas("Zapato 1", "https://example.com/zapato1.jpg", 99.99)
        shoeList.add(shoeItem1)
        val shoeItem2 = Zapatillas("Zapato 2", "https://example.com/zapato2.jpg", 79.99)
        shoeList.add(shoeItem2)
        val shoeItem3 = Zapatillas("Zapato 3", "https://example.com/zapato3.jpg", 149.99)
        shoeList.add(shoeItem3)
        val shoeItem4 = Zapatillas("Zapato 4", "https://example.com/zapato4.jpg", 129.99)
        shoeList.add(shoeItem4)
        val shoeItem5 = Zapatillas("Zapato 5", "https://example.com/zapato5.jpg", 109.99)
        shoeList.add(shoeItem5)

        val shoeItem6 = Zapatillas("Zapato 6", "https://example.com/zapato6.jpg", 89.99)
        shoeList.add(shoeItem6)
        val shoeItem7 = Zapatillas("Zapato 7", "https://example.com/zapato7.jpg", 199.99)
        shoeList.add(shoeItem7)
        val shoeItem8 = Zapatillas("Zapato 8", "https://example.com/zapato8.jpg", 169.99)
        shoeList.add(shoeItem8)
        val shoeItem9 = Zapatillas("Zapato 9", "https://example.com/zapato9.jpg", 119.99)
        shoeList.add(shoeItem9)
        val shoeItem10 = Zapatillas("Zapato 10", "https://example.com/zapato10.jpg", 149.99)
        shoeList.add(shoeItem10)
        return shoeList
    }
}
