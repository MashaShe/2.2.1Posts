data class Reposts (
    var count: Int=0, // число пользователей, скопировавших запись;
    val userResposted: Boolean = false // наличие репоста от текущего пользователя (1 — есть, 0 — нет).
) {
}