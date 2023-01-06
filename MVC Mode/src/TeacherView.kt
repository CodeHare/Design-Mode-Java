class TeacherView {
    fun printTeacherDetails(name: String?, subject: String?, gender: Int, code: Int) {
        val personalPronoun = judgePersonalPronoun(gender)
        val subjectPersonalPronoun = judgeSubjectPersonalPronoun(gender)
        println("$subjectPersonalPronoun is a teacher, $personalPronoun name is $name.")
        println("$subjectPersonalPronoun teaches subject is $subject.")
        println("$subjectPersonalPronoun employee number is $code.")
    }

    fun judgePersonalPronoun(gender: Int): String {
        return if (gender == 1) "his" else "her"
    }

    fun judgeSubjectPersonalPronoun(gender: Int): String {
        return if (gender == 1) "he" else "she"
    }
}