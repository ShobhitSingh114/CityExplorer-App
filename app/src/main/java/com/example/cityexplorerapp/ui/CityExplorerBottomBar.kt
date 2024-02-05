package com.example.cityexplorerapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cityexplorerapp.R

@Composable
fun CityExplorerBottomBar() {

    BottomAppBar(
        modifier = Modifier
//            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_normal))
        ) {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = dimensionResource(id = R.dimen.padding_small))
            ) {
                androidx.compose.material3.Text(text = "cancel")
            }

            Button(
                onClick = { /*TODO*/ },
                // this is how to change button color
//                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.),
                modifier = Modifier
                    .weight(1f)
                    .padding(end = dimensionResource(id = R.dimen.padding_small))
            ) {
                androidx.compose.material3.Text(text = "next")
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun CityExplorerBottomBarPreview() {
    CityExplorerBottomBar()
}
