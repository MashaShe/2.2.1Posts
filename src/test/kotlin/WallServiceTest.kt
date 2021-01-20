import WallService.posts
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addTest() {
        val myPost = Post(
            id = 1,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "My first post. On my own Wall",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = true,
            canEdit = true
        )

        WallService.add(myPost)
        val result = posts[0].id !== 0
        val expected = true
        assertEquals(result, expected)
    }
    @Test
    fun updateExistingIdTest() {
        val myPost = Post(
            id = 1,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "My first post. On my own Wall",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = true,
            canEdit = true
        )

        val myPost2 = Post(
            id = 1,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "Updated",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = true,
            canEdit = true
        )


        WallService.add(myPost)
        val result = WallService.update(myPost2)
        val expected = true
        assertEquals(result, expected)
    }
    @Test
    fun updateNonExistingIdTest() {
        val myPost = Post(
            id = 1,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "My first post. On my own Wall",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = true,
            canEdit = true
        )

        val myPost2 = Post(
            id = 9,
            ownerId = 1,
            formId = 1,
            date = 1610312400,
            text = "Updated!",
            comments = Comment(0),
            likes = Likes(2, true),
            reposts = Reposts(2),
            views = Views(32),
            postType = "post",
            canDelete = true,
            canEdit = true
        )


        WallService.add(myPost)
        val result = WallService.update(myPost2)
        val expected = false
        assertEquals(result, expected)
    }
}


