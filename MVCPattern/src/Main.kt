object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val model = retrieveStudentFromDatabase()
        val view = TeacherView()
        val controller = TeacherController(model, view)
        controller.updateView()
    }

    private fun retrieveStudentFromDatabase(): Teacher {
        val teacher = Teacher()
        teacher.name = "CodeHare"
        teacher.subject = "Chinese"
        teacher.gender = 0
        teacher.code = 20230105
        return teacher
    }
}