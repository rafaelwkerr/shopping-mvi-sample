package shopping.kerrlabs.com.shopping.model.store

import io.reactivex.Observable
import shopping.kerrlabs.com.shopping.model.data.Product


class SearchStore {

    fun searchFor(searchWord: String): Observable<List<Product>> {
        val products = listOf<Product>()
        return Observable.fromArray(products)
    }

}