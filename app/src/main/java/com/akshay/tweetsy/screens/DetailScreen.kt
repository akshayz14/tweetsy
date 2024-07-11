package com.akshay.tweetsy.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.akshay.tweetsy.models.TweetListItem
import com.akshay.tweetsy.viewmodels.DetailViewModel

@Composable
fun DetailScreen() {
    val detailViewmodel: DetailViewModel = hiltViewModel()
    val tweets = detailViewmodel.tweets.collectAsState()

    LazyColumn(content = {
        items(tweets.value) { tweet ->
            DetailScreenItem(tweet = tweet)
        }
    })


}

@Composable
fun DetailScreenItem(tweet: TweetListItem) {

    Box(
        modifier = Modifier
            .padding(5.dp)
            .border(2.dp, Color.Gray)
            .background(Color.White)
            .fillMaxWidth()

    ) {
        Text(
            text = tweet.text,
            Modifier.padding(10.dp),
            color = Color.Black
        )
    }


}