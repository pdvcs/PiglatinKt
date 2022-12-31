package net.pdutta.sandbox

fun piglatin (phrase: String): String {
    val vowels = "aeiou".toCharArray()
    val vowelsPlus = "aeiouy".toCharArray()
    val outputWords = mutableListOf<String>()

    for (word in phrase.lowercase().split(" ")) {
        if (word[0] in vowels) {
            // although snowcrest.net doesn't work this way, this appears to be better
            //                                               V
            outputWords.add(word + (if (word.last() == 'w') "ay" else "way"))
        } else if (word.slice(0..1) == "qu") {
            outputWords.add(word.drop(2) + "quay")
        } else {
            var consonantFound = false
            var vowelList = vowels
            word.forEachIndexed { ix, value ->
                if (ix > 0) vowelList = vowelsPlus
                if (!consonantFound && value in vowelList) {
                    consonantFound = true
                    outputWords.add(word.drop(ix) + word.slice(0..ix-1) + "ay")
                }
            }
        }
    }
    return outputWords.joinToString(separator = " ")
}
