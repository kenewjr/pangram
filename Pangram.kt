import java.util.regex.Pattern

object Pangram {

    fun isPangram(input: String): Boolean {
       val regist = "[a-z]"
        val gerak = Pattern.compile(regist)
        val cocok = gerak.matcher(input.toLowerCase())

        var cocokCount = 0
        val cocokgroup= mutableListOf<String>()
        while (cocok.find()){
            if(!cocokgroup.contains(cocok.group())){
                cocokgroup.add(cocok.group())
                println("$cocokCount : ${cocok.group()}")
                cocokCount++
            }
        }
        return cocokCount == 26
    }
}
