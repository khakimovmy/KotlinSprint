package org.example.lesson_22

class MainScreenViewModel {
    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "Loaded Data", isLoading = false)
    }
}