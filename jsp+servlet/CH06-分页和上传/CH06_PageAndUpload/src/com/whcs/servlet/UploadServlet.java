package com.whcs.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request.setCharacterEncoding("utf-8"):设置request的编码格式
		response.setCharacterEncoding("UTF-8");
		String uploadFileName = ""; // 上传的文件名
		String fieldName = ""; // 表单字段元素的name属性值
		// 请求信息中的内容是否是multipart类型,判断上传的表单是不是multipart类型
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		// 上传文件的存储路径（服务器文件系统上的绝对文件路径）
//		String uploadFilePath = request.getSession().getServletContext().getRealPath("upload/");
		String uploadFilePath = "D:\\works\\";
		System.out.println("uploadFilePath=" + uploadFilePath);
		if (isMultipart) {
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				// 解析form表单中所有文件
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) { // 依次处理每个文件
					// <input type="text" name="user">
					// <input type="file" name="nfile">
					FileItem item = (FileItem) iter.next();
					
					if (item.isFormField()) { // 普通表单字段 text password checkbox
						fieldName = item.getFieldName(); // 表单字段的name属性值=user
						if (fieldName.equals("user")) {
							// 输出表单字段的值
							response.getWriter().append(item.getString("UTF-8") + "上传了文件。<br/>");
						}
					} else { // 文件表单字段 file
						String fileName = item.getName();// item.getName():获取上传文件名称：杰森史坦森.jpg
						if (fileName != null && !fileName.equals("")) {
							File fullFile = new File(item.getName());

							String fileFullName = fullFile.getName();
							File saveFile = new File(uploadFilePath, fileFullName);

							item.write(saveFile);//文件复制，上传文件了
							response.getWriter().append("上传成功后的文件名是：" + fileFullName);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			response.getWriter().append("Form表单的类型不正确");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
