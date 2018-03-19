package shopping.kerrlabs.com.shopping.view.search

import shopping.kerrlabs.com.shopping.model.data.Product


sealed class SearchViewState {
    class SearchNotStartedYet : SearchViewState()
    class Loading : SearchViewState()
    class EmptyResult(searchQueryText: String) : SearchViewState()
    class SearchResult(searchQueryText: String, result: List<Product>) : SearchViewState()
    class Error(searchQueryText: String, error: Throwable) : SearchViewState()
}