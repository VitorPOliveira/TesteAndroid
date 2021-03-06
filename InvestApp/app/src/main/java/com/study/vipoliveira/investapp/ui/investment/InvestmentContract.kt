package com.study.vipoliveira.investapp.ui.investment

import com.study.vipoliveira.investapp.data.network.investment.entities.Screen
import com.study.vipoliveira.investapp.ui.BaseContract

interface InvestmentContract {
    interface View: BaseContract.View{
        fun updateInvestScreen(screen: Screen)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun getInvestments()
    }
}
