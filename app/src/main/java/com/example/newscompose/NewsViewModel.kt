package com.example.newscompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel: ViewModel() {

    private val _title: MutableLiveData<String> = MutableLiveData(news_title)
    val title: LiveData<String> = _title

    private val _date: MutableLiveData<String> = MutableLiveData(news_date)
    val date: LiveData<String> = _date

    private val _description: MutableLiveData<String> = MutableLiveData(news_description)
    val description: LiveData<String> = _description

}

private val news_title = "Глава МИД РФ Сергей Лавров не исключил, что НАТО и ЕС собирают коалицию для войны с Россией. Такое заявление представитель Кремля сделал 24 июня в ходе пресс-конференции с коллегой из Азербайджана."

private val news_date = "24 июня 2022"

private val news_description = "В Москве оценили шаги, которые предпринимают страны Запада вокруг государств-кандидатов в ЕС. Видео с фрагментом выступления дипломата публикует Telegram-канал \"На видео видно\". По словам руководителя Министерства иностранных дел РФ, в Кремле не питают иллюзий по поводу того, что в Евросоюзе пройдет русофобская заряженность. \n" +
        "\n" +
        "\"Сейчас также, в том числе, и Евросоюз, вместе с НАТО, собирают такую уже современную коалицию для борьбы, а по большому счету, войны с Российской Федерацией\", - заявил Сергей Лавров.\n" +
        "\n" +
        "При этом глава МИД РФ сравнил текущие события с ситуацией перед Великой Отечественной войной, когда Адольф Гитлер захватил часть европейских стран перед нападением на Советский союз. Министр отметил, что в Москве будут очень внимательно наблюдать за происходящим вокруг.  \n" +
        "\n" +
        "Ранее в Европарламенте заявили, что Европа имеет право передать Киеву ядерное оружие. Такое заявление 12 июня сделал представитель ЕП Радослав Сикорский. Подробнее о словах бывшего главы МИД Польши читайте в нашем материале по ссылке ниже. "

