package data

class Note(title: String) {
     var title = title
         set(value) {
            if (value.isNotBlank()) {
                println(value)
            }else{
                println("Invalid value")
            }
        }
}