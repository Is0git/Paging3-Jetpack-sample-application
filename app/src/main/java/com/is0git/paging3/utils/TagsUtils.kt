package com.is0git.paging3.utils

import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

infix fun ChipGroup.addChip(message: String?) {
    val chip = Chip(this.context)
    chip.text = message
    this.addView(chip)
}