data class LinkAttachment (
    override val type: String,
    val link: Link
):Attachment {

}

data class Link(
    val url: String = " ", // URL ссылки.
    val title: String = " ", //заголовок ссылки.
    val caption: String? = " ", // подпись ссылки (если имеется).
    val description: String = " ", // описание ссылки.
    val photo: Photo?, // изображение превью, объект фотографии (если имеется) - см отдельный класс
    val product: Product?, // информация о продукте (если имеется). Поле возвращается для ссылок на магазины, например, Aliexpress. Объект с единственным полем price (object), которое описано на отдельной странице.
    val button: ButtonPost?, // информация о кнопке для перехода (если имеется) - см отдельный класс
    val previewPage: String = " ", //идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val previewUrl: String = " " // URL страницы с контентом для предпросмотра содержимого страницы.
)

data class Product(
    val price: Price? // Объект price, описывающий цену
)

data class Price(
    val amount: Int = 0, //целочисленное значение цены, умноженное на 100;
    val currency: Currency?, //объект currency описывающий информацию о валюте
    val text: String = " "// — строка с локализованной ценой и валютой;
)

data class Currency(
    val id: Int = 0, //идентификатор валюты;
    val name: String = " " // — буквенное обозначение валюты;
)

data class ButtonPost(
    val title: String = " ", //название кнопки.
    val action: Action? //действие для кнопки. Объект, который содержит следующие поля:

)

data class Action(
    val type: String = " ", // тип действия. Возможные значения: open_url — открыть адрес из поля url;
    val url: String = " " // URL для перехода.
)