package com.sample.android.tmdb.ui.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sample.android.tmdb.R

object Dimens {

    val PaddingSmall: Dp
        @Composable get() = dimensionResource(R.dimen.padding_small)

    val PaddingMedium = 12.dp

    val paddingBottom = 10.dp

    val paddingMicro = 2.dp

    val rowHeight = 36.dp
}