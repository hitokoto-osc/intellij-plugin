package intellij.plugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class StartupActivity implements com.intellij.openapi.startup.StartupActivity
{
    @Override
    public void runActivity(@NotNull Project project)
    {
        var yiyan = new YiYan().getOnce();
        Notify.info(project, yiyan);
    }
}
