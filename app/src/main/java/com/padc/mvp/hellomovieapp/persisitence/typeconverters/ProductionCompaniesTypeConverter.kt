package com.padc.mvp.hellomovieapp.persisitence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padc.mvp.hellomovieapp.data.vos.ProductionCompanieVO

class ProductionCompaniesTypeConverter {

    @TypeConverter
    fun toString(productionCompanyList: List<ProductionCompanieVO>?):String{
        return Gson().toJson(productionCompanyList)
    }

    @TypeConverter
    fun toProductionCompanyList(productionCompanyListJsonString: String): List<ProductionCompanieVO>?{
        val productionCompanyListType = object : TypeToken<List<ProductionCompanieVO>?>(){}.type
        return Gson().fromJson(productionCompanyListJsonString,productionCompanyListType)
    }
}