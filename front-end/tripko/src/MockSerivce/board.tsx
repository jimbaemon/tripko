import mocker from "mocker-data-generator";

const board = {
  board_id: {
    chance: "guid",
  },
  created_by: {
    chance: "guid",
  },
  place: {
    faker: "address.city",
  },
  title: {
    faker: "lorem.sentence",
  },
  thumbnail: {
    faker: "image.city",
  },
  content: {
    faker: "lorem.words",
  },
  short_description: {
    faker: "lorem.sentence",
  },
  like_count: {
    faker: "random.number",
  },
  created_at: {
    faker: "date.past",
  },
  modified_at: {
    faker: "date.past",
  },
  delete_yn: {
    faker: "random.boolean",
  },
  deleted_by: {
    chance: "guid",
  },
  deleted_at: {
    faker: "date.past",
  },
};

export const getBoards = () => {
  return mocker()
    .schema("payload", board, 100)
    .build(function (err, data) {
      return data;
    });
};
