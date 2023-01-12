class TeacherController internal constructor(private val model: Teacher, private val view: TeacherView) {
    var name: String?
        get() = model.name
        set(name) {
            model.name = name
        }
    var subject: String?
        get() = model.subject
        set(subject) {
            model.subject = subject
        }
    var gender: Int
        get() = model.gender
        set(gender) {
            model.gender = gender
        }
    var code: Int
        get() = model.code
        set(code) {
            model.code = code
        }

    fun updateView() {
        view.printTeacherDetails(model.name, model.subject, model.gender, model.code)
    }
}