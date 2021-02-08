package com.example.tcschallenge


class EnglishCourse {


    fun returnVowels(word: String): String {
        val vowels: StringBuilder = StringBuilder()

        for (i in word.indices) {

            val char = word[i]

            if (char == 'a' || char == 'A' ||
                char == 'e' || char == 'E' ||
                char == 'i' || char == 'I' ||
                char == 'o' || char == 'A' ||
                char == 'u' || char == 'U'
            ) {
                vowels.append(char)
                vowels.append(" ")
            }

        }

        return vowels.toString()
    }

    fun returnIfPalindrome(word: String) : Boolean{
        val stringBuilder = StringBuilder(word)
        val reverseWord = stringBuilder.reverse().toString()
        return word.equals(reverseWord, ignoreCase = true)
    }

    fun returnSubString(word: String, number: Int) : String{
        return word.substring(0, number)
    }


}