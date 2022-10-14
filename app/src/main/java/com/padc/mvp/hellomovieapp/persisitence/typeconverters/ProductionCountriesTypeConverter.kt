package com.padc.mvp.hellomovieapp.persisitence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padc.mvp.hellomovieapp.data.vos.ProductionCountrieVO

class ProductionCountriesTypeConverter {

    @TypeConverter
    fun toString(productionCountryList: List<ProductionCountrieVO>?): String {
        return Gson().toJson(productionCountryList)
    }

    @TypeConverter
    fun toProductionCountryList(productionCountryListJsonString: String): List<ProductionCountrieVO>? {
        val productionCountryListType = object : TypeToken<List<ProductionCountrieVO>?>() {}.type
        return Gson().fromJson(productionCountryListJsonString, productionCountryListType)
    }
}