package com.bmesquita.calculator.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import com.bmesquita.calculator.domain.CalculatorAction
import com.bmesquita.calculator.domain.Operation

val calculatorActions = listOf(
    CalculatorUIAction(
        text = "AC",
        highlightLevel = HighlightLevel.Highlighted,
        action = CalculatorAction.Clear
    ),
    CalculatorUIAction(
        text = "()",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = CalculatorAction.Parentheses
    ),
    CalculatorUIAction(
        text = "%",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = CalculatorAction.Op(Operation.PERCENT)
    ),
    CalculatorUIAction(
        text = "÷",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = CalculatorAction.Op(Operation.DIVIDE)
    ),
    CalculatorUIAction(
        text = "7",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(7)
    ),
    CalculatorUIAction(
        text = "8",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(8)
    ),
    CalculatorUIAction(
        text = "9",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(9)
    ),
    CalculatorUIAction(
        text = "x",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = CalculatorAction.Op(Operation.MULTIPLY)
    ),
    CalculatorUIAction(
        text = "4",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(4)
    ),
    CalculatorUIAction(
        text = "5",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(5)
    ),
    CalculatorUIAction(
        text = "6",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(6)
    ),
    CalculatorUIAction(
        text = "-",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = CalculatorAction.Op(Operation.SUBTRACT)
    ),
    CalculatorUIAction(
        text = "1",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(1)
    ),
    CalculatorUIAction(
        text = "2",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(2)
    ),
    CalculatorUIAction(
        text = "3",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(3)
    ),
    CalculatorUIAction(
        text = "+",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = CalculatorAction.Op(Operation.ADD)
    ),
    CalculatorUIAction(
        text = "0",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Number(0)
    ),
    CalculatorUIAction(
        text = ".",
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Decimal
    ),
    CalculatorUIAction(
        text = null,
        content = {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        highlightLevel = HighlightLevel.Neutral,
        action = CalculatorAction.Delete
    ),
    CalculatorUIAction(
        text = "=",
        highlightLevel = HighlightLevel.StronglyHighlighted,
        action = CalculatorAction.Calculate
    ),
)