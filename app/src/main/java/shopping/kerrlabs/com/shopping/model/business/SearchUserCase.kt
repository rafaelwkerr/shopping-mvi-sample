package shopping.kerrlabs.com.shopping.model.business

import io.reactivex.Observable
import shopping.kerrlabs.com.shopping.model.store.SearchStore
import shopping.kerrlabs.com.shopping.view.search.SearchViewState


class SearchUserCase {

    private val searchStore = SearchStore()

    fun search(searchWord: String): Observable<SearchViewState> {

        if(searchWord.isEmpty())
            return Observable.just(SearchViewState.SearchNotStartedYet())

        return searchStore.searchFor(searchWord)
                .map ({
                    SearchViewState.SearchResult(searchWord, it)
                })
    }

}