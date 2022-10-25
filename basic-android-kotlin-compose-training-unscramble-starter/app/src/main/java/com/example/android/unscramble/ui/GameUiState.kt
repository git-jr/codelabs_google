package com.example.android.unscramble.ui

data class GameUiState(
    val currentScrambleWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val currentWordCount: Int = 0,
    val score: Int = 0,
    val isGameOver: Boolean = false
)
