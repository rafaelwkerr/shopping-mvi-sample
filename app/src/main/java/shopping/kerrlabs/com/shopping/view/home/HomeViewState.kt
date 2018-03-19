package shopping.kerrlabs.com.shopping.view.home

import shopping.kerrlabs.com.shopping.model.data.Product

sealed class HomeViewState(val loadingFirstPage: Boolean = false,
                           val firstPageError: Throwable?,
                           val loadingNextPage: Boolean = false,
                           val nextPageError: Throwable?,
                           val loadingPullToRefresh: Boolean = false,
                           val pullToRefreshError: Throwable?,
                           val products: List<Product>){

}