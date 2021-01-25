import WallService.comments
import WallService.posts
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
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
            comments = CommentInfo(0),
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
            comments = CommentInfo(0),
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
            comments = CommentInfo(0),
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
            comments = CommentInfo(0),
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
            comments = CommentInfo(0),
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

    @Test (expected = WallService.PostNotFoundException::class)
    fun commentsShouldThrow (){
        val myPost = Post(
                id = 1,
                ownerId = 1,
                formId = 1,
                date = 1610312400,
                text = "My first post. On my own Wall",
                comments = CommentInfo(0),
                likes = Likes(2, true),
                reposts = Reposts(2),
                views = Views(32),
                postType = "post",
                canDelete = true,
                canEdit = true
        )
        val myComment = Comment(
                id=1,
                postId = 12
        )

        WallService.add(myPost)
        WallService.createComment(myComment)

    }

    @Test
    fun commentsShouldNotThrow() {
        val myPost = Post(
                id = 1,
                ownerId = 1,
                formId = 1,
                date = 1610312400,
                text = "My first post. On my own Wall",
                comments = CommentInfo(0),
                likes = Likes(2, true),
                reposts = Reposts(2),
                views = Views(32),
                postType = "post",
                canDelete = true,
                canEdit = true
        )
        val myComment = Comment(
                id=2,
                postId = 1
        )
        WallService.add(myPost)
        WallService.createComment(myComment)
        val result = comments.last().id
        val expected = 2
        assertEquals(result,expected)
    }
}


