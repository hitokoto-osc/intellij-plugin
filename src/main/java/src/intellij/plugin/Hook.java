package src.intellij.plugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;

public class Hook implements HookInterface
{
    @Override
    public void projectOpened()
    {
        var projects = ProjectManager.getInstance().getOpenProjects();
        var yiyan    = new YiYan().getOnce();
        for (Project project : projects) {
            Notify.info(project, yiyan);
        }
    }

    @Override
    public void projectClosed()
    {

    }
}
