package rdc.move_test.model

import rdc.move_test.util.CurrencyHelper

class Property {
    var address: Address? = null

    var price: Int? = null

    var photos: List<Photo>? = null

    var property_id: String? = null

    val presentableAddress: String
        get() {
            val thisAddress = address
            return if (thisAddress != null) {
                listOfNotNull(thisAddress.line, thisAddress.city, thisAddress.state).joinToString()
            } else {
                "Error! No address found."
            }
        }

    val propertyIdDisplay : String
        get() {
            val thisPropId = property_id;
            return if (thisPropId != null) {
                thisPropId
            } else {
                "Error! No property ID found."
            }
        }

    /*val singlePhoto: String
        get() {
            val thisPhotos = photos
            return if (!thisPhotos.isNullOrEmpty()) {
                thisPhotos.firstOrNull()?.href ?: ""
            } else {
                ""
            }
        }*/

    val presentablePrice: String
        get() {
            return if (price != null) {
                CurrencyHelper.instance.currencyInstance.format(price)
            } else {
                "Price Error"
            }
        }


}
