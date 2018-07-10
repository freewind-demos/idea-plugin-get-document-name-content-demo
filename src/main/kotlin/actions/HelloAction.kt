package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.TextEditor
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        event.project?.run {
            val editorManager = FileEditorManager.getInstance(this)
            val currentEditor = editorManager.selectedEditors.firstOrNull()
            when (currentEditor) {
                is TextEditor -> showNameAndContent(currentEditor)
                else -> Messages.showWarningDialog("Please open a text file with content", "can't show content")
            }
        }
    }

    private fun showNameAndContent(editor: TextEditor) {
        val fileName = editor.file!!.name
        val content = editor.editor.document.text
        Messages.showInfoMessage(content.take(100), fileName)
    }

}