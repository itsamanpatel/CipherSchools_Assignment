 
#include <bits/stdc++.h>
using namespace std;

class DeleteNode{
	
public:
	int value;
	DeleteNode* next;
};

void push(DeleteNode** Delete_head, int New_value)
{
	DeleteNode* new_node = new DeleteNode();
	new_node->value = New_value;
	new_node->next = (*Delete_head);
	(*Delete_head) = new_node;
}

void deleteNode(DeleteNode** Delete_head, int key)
{

	DeleteNode* temp = *Delete_head;
	DeleteNode* prev = NULL;

	if (temp!=NULL && temp->value==key)
	{
		*Delete_head = temp->next; 
		delete temp;	
		return;
	}
	else
	{
	while (temp!= NULL && temp->value!= key)
	{
		prev = temp;
		temp = temp->next;
	}

	if (temp == NULL)
		return;

	prev->next = temp->next;

	delete temp;
	}
}

void printList(DeleteNode* DeleteNode)
{
	while (DeleteNode != NULL) 
	{
		cout << DeleteNode->value << " ";
		DeleteNode = DeleteNode->next;
	}
}

int main()
{
	DeleteNode* head = NULL;
	push(&head, 7);
	push(&head, 1);
	push(&head, 3);
	push(&head, 2);

	puts("Linked List : ");
	printList(head);

	deleteNode(&head, 1);
	puts("\nafter Deletion : ");
	
	printList(head);
	
	return 0;
}

