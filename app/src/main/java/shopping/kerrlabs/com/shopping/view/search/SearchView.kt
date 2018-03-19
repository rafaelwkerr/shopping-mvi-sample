package shopping.kerrlabs.com.shopping.view.search

import io.reactivex.Observable


interface SearchView {

    fun searchIntent(): Observable<String>

    fun render(viewState: SearchViewState)

}